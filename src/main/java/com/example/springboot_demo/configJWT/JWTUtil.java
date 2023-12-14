package com.example.springboot_demo.configJWT;

import java.util.Calendar;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.example.springboot_demo.entity.Tstudent;


public class JWTUtil {
    private final static String  SECURT = "123";

    public static String generateToken(Tstudent student) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, 7);
        JWTCreator.Builder bulider = JWT.create();
        bulider.withClaim("studentId",student.getId());
        bulider.withClaim("num", student.getNum());
        bulider.withClaim("name", student.getName());
        String token = bulider.withExpiresAt(calendar.getTime()).sign(Algorithm.HMAC256(SECURT));
        return token;

    }
    public static DecodedJWT verfiy(String token) {
        JWTVerifier jwtVerifier = JWT.require( Algorithm.HMAC256(SECURT)).build();
        return jwtVerifier.verify(token);
    }
    public static void main(String []args) throws Exception{
        Tstudent s = new Tstudent();
        s.setNum("2001");
        s.setName("张三1");
        String token = generateToken(s);
        DecodedJWT decode = verfiy(token);
        String payload = decode.getPayload();
    }
}

