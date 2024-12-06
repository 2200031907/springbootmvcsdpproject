<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View All Employees</title>
    <style>
           * {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: 'Arial', sans-serif;
}

body {
    background-color: #f9f9f9;
    color: #333;
}

h3 {
    text-align: center;
    color: #333;
    font-size: 1.8rem;
    margin: 20px 0;
}

table {
    width: 100%;
    max-width: 1200px;
    margin: 20px auto;
    border-collapse: collapse;
    background-color: #fff;
    border-radius: 8px;
    overflow: hidden;
    box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

th, td {
    padding: 12px 15px;
    text-align: center;
    transition: background-color 0.3s ease;
}

th {
    background-color: #0066ff;
    color: #fff;
    font-weight: bold;
    text-transform: uppercase;
}

td {
    color: #555;
}

tr:nth-child(even) {
    background-color: #f3f4f6;
}

tr:hover {
    background-color: #e2e8f0;
}

tr:nth-child(odd) {
    background-color: #fff;
}

td, th {
    border-bottom: 1px solid #e2e8f0;
}

td:last-child, th:last-child {
    border-right: none;
}

th:first-child, td:first-child {
    border-left: none;
}

@media (max-width: 768px) {
    table {
        font-size: 0.9rem;
    }

    th, td {
        padding: 8px 10px;
    }
}

    </style>
</head>
<body>
    <h3 style="text-align: center;"><u>View All Employees</u></h3>
    <table>
        <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>GENDER</th>
            <th>DATE OF BIRTH</th>
            <th>DEPARTMENT</th>
            <th>SALARY</th>
            <th>LOCATION</th>
            <th>EMAIL</th>
            <th>CONTACT</th>
            <th>STATUS</th>
        </tr>
        <c:forEach items="${emplist}" var="emp">
            <tr>
                <td><c:out value="${emp.id}"/></td>
                <td><c:out value="${emp.name}"/></td>
                <td><c:out value="${emp.gender}"/></td>
                <td><c:out value="${emp.dateofbirth}"/></td>
                <td><c:out value="${emp.department}"/></td>
                <td><c:out value="${emp.salary}"/></td>
                <td><c:out value="${emp.location}"/></td>
                <td><c:out value="${emp.email}"/></td>
                <td><c:out value="${emp.contact}"/></td>
                <td><c:out value="${emp.status}"/></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
