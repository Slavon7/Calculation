<!DOCTYPE html>
<html lang="en" xmlns:th="http://thymeleaf.org" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
      xsi:schemaLocation="http://thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>Random Number</title>
</head>
<body>
<h1>Random Number</h1>
<p>Random number generated: <span th:text="${randomNumber}"></span></p>
</body>
</html>