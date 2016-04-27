<%@include file="../header.jsp" %>

<h1 class="header">Department Details</h1>
<div class="container-fluid">
    <table class="table table-bordered table-hover">
        <tr>
            <th>Id</th>
            <th>Dept_code</th>
            <th>Dept_name</th>
            <th>Dept_description</th>
            <th>Added_Date</th>
            <th>Modified_Date</th>
            <th>Status</th>
        </tr>
        
        <c:forEach var="dept" items="${requestScope.deptList}">
            <tr>
                <td>${dept.id}</td>
                <td>${dept.code}</td>
                <td>${dept.name}</td>
                <td>${dept.description}</td>
                <td>${dept.added_date}</td>
                <td>${dept.modified_date}</td>
                <td>${dept.status}</td>
            </tr>
        </c:forEach>
    </table>
</div>
    
   

</body>
</html>
