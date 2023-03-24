<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/layout/header.jsp"/>
<style>
	main {
		display: flex;
		padding: 20px;
		flex-direction: column;
		align-items: center;
		justify-content: flex-start;
	}
	main pre {
		width: 100%;
		border: 1px solid black;
		padding: 20px;
	}
</style>

<main>
	<pre>
		<% %> <-- 스크립트 릿(scriptlet, HTML 랜더링 후 태그는 보이지 않습니다.)
		<%="" %> <-- 표현식(experssion, HTML 랜더링 후 태그는 보이지 않습니다.)
		<%-- 여기는 확인할 수 없어요!! --%> <-- jsp 주석(HTML 랜더링 후 태그는 보이지 않습니다.)
		<!-- 여기는 HTML 주석 입니다. 소스보기로 확인 가능 합니다. -->
		
		----------------------------------------------------------------
		스크립트 릿은 HTML과 Java 코드를 혼합하여 사용할 수 있습니다.
		<% new java.util.Date(); %> <-- 부분은 출력은 안됨.
		화면에 데이터를 출력 하려면 표현식을 사용해야 한다.
		<%= new java.util.Date() %> 
		----------------------------------------------------------------
		
		사용방법
		스크립트 릿 : <% %> JSP 페이지에서 자바코드를 실행 할 수 있습니다.
		표현식 : <%= "" %> JSP 페이지에서 Java 코드의 결과 값을 출력할 수 있습니다.
		
		자바 코드 위치 
		스크립트 릿 : JSP 페이지 어디든지 위치할 수 있습니다.
		표현식 : HTML 태그 내부에서ㅁ나 사용할 수 있습니다.
		
		출력 결과
		스크립트 릿 : 출력 결과를 지정하지 않으면 아무런 출력이 되지 않습니다.
		표현식 : 자바 결과 값을 출력합니다.
		
	</pre>
</main>


<jsp:include page="/layout/footer.jsp"/>