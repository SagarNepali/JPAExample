<%@include file="../header.jsp" %>
<h1 class="header">Employee Details</h1>
<div class="container-fluid">
    <table class="table table-bordered table-hover">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>Contact</th>
            <th>Department_id</th>
            <th>Status</th>
        </tr>

        <c:forEach var="emp" items="${requestScope.empList}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.email}</td>
                <td>${emp.contact}</td>
                <td>${emp.deptId}</td>
                <td>${emp.status}</td>
            </tr>
        </c:forEach>
    </table>
</div>



</body>
</html>
