<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="stylesheet.css">
</head>
<body>
<%! public String board(int a,int b,String contentt){
	
	for(int i=0;i<=a;i++){
		contentt += "<div class='row'>";
				for (int j=0;j<=b;j++ ){
					if(i%2==0){
						if(j%2!=0){
							contentt+="<div class='red'></div>";
								
						}
						else{
							contentt+= "<div class='blue'></div>";

						}
					}
					if(i%2!=0){
						if(j%2==0){
							contentt+="<div class='red'></div>";
								
						}
						else{
							contentt+= "<div class='blue'></div>";

						}
					}
				}
		contentt+="</div>";
		
	}
	return contentt;
} %>
<% int a = Integer.valueOf(request.getParameter("row"));
int b = Integer.valueOf(request.getParameter("col")); 
 String contentt="";
%>

<%= board(a,b,contentt) %>
</body>
</html>