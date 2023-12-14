package com.example.springboot_demo.configJWT;

import com.auth0.jwt.exceptions.AlgorithmMismatchException;
import com.auth0.jwt.exceptions.SignatureVerificationException;
import com.auth0.jwt.exceptions.TokenExpiredException;
import com.auth0.jwt.interfaces.Claim;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.example.springboot_demo.union.result.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebFilter("/mgt/*")
public class AppendParametersFilter implements Filter {

	public void doFilter(ServletRequest request, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse response = (HttpServletResponse) resp;
		String requestUrl = req.getRequestURI();
		System.out.println(requestUrl);
		
		if(requestUrl.contains("/mgt/student/login")) {
			chain.doFilter(request, response);
			return;
		}

		response.setHeader("Access-Control-Allow-Origin", "*");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Methods", "GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS");
		response.setHeader("Access-Control-Max-Age", "86400");
		response.setHeader("Access-Control-Allow-Headers", "Content-Type, token");

		// 如果是OPTIONS请求则结束
		if (HttpMethod.OPTIONS.toString().equals(req.getMethod())) {
			response.setStatus(HttpStatus.NO_CONTENT.value());
			return;
		}

		String token = req.getHeader("token");
		if (!StringUtils.hasText(token)) {
			sendToClient(response, "token为空");
			return;
		}
		try {
			DecodedJWT decodedJWT = JWTUtil.verfiy(token);
            //获取学生的
			Claim claim = decodedJWT.getClaim("studentId");
			ParameterRequestWrapper wrapper = new ParameterRequestWrapper(req);
			if (claim != null) {
				long studentId = claim.asLong().longValue();
				wrapper.addParameter("studentId", studentId);
			}
			//获取管理员
			//获取辅导员
			chain.doFilter(wrapper, response);
		} catch (SignatureVerificationException e) {
			e.printStackTrace();
			sendToClient(response, "签名错误");

		} catch (TokenExpiredException e) {
			e.printStackTrace();
			sendToClient(response, "token过期");

		} catch (AlgorithmMismatchException e) {
			e.printStackTrace();
			sendToClient(response, "签名算法不匹配");

		} catch (Exception e) {
			e.printStackTrace();
			sendToClient(response, e.getMessage());
		}

	}

	@Override
	public void destroy() {
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
	}

	private void sendToClient(HttpServletResponse response, String message) throws IOException {
		Result result = Result.TOEKN_ERROR(message);
		ObjectMapper mapper = new ObjectMapper();
		String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().write(json);
	}

}
