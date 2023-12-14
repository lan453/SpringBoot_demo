var data = [{
    text: '基础数据管理',
    iconCls: 'icon-sum',
    state: 'open',
    children: [{
        text: '学院管理',
        page:'/mgt/colleage/collegeMain.html'
    },{
        text: '辅导员管理',
        page: '/mgt/instructor/instructorMan.html'
    },{
        text: '班级管理',
        page: '/mgt/class/classMan.html'
    },{
        text: '专业管理',
        page: '/mgt/major/majorMain.html'
    }]
}
];
function doOpenPage(item){
    addTable(item);
}
function addTable(item){
    let exists=$('#tt').tabs('exists',item.text);
    let  pageIframe = "<iframe src='"+item.page+"' frameborder=0 width='100%' height='100%''"+" />";
    if(exists==true){
        $('#tt').tabs('select',item.text);
    }else{
        $('#tt').tabs('add',{
            title:item.text,
            closable:true,
            content:pageIframe
            // href:item.page
        })

    }
}
