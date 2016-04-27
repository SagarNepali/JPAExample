<%@include file="index.jsp" %>

<h1>Edit Department info</h1>

<div class="container-fluid">
    <form action="${SITE_URL}/department/edit.jsp" method="post" >
        <div class="form-group">
            <label >Dept_Code</label>
            <input name="deptCode" type="text" class="form-control" id="deptCode" >
        </div>
        <div class="form-group">
            <label >Dept_Name</label>
            <input name="deptName" type="text" class="form-control" required="true" id="deptName" >
        </div>
        <div class="form-group">
            <label >Dept_Desc</label>
            <input name="deptDesc" type="text" class="form-control" required="true" id="deptDesc" >
        </div>
        
        <div class="form-group">
            <label >Status</label>
            <input name="status" type="text" class="form-control" required="true" id="workplace" >
        </div>

        <input type="hidden" name="id" />
        <a href="${SITE_URL}/department/index.jsp" class="btn btn-default btn-danger">Back</a>
        <button type="submit" class="btn btn-default btn-success">Save</button>



    </form>


</div>

</body>
</html>
