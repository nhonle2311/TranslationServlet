<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>simple_dictionary</title>
</head>
<body>
    <h1>simple_dictionary</h1>
    <form action="${pageContext.request.contextPath}/translate" method="post">
        <input type="text" name="txtSeach" placeholder="enter your word: "/>
        <input type="submit" id="submit" value="seach">
    </form>
</body>
</html>