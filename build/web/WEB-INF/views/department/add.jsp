<%@include file="../index.jsp" %>
   <h1>Add Doctor Information!</h1>


<div class="container-fluid">
    <form action="${SITE_URL}/department/add?sucess" method="post" >
        <div class="form-group">
            <label >Department Code</label>
            <input name="deptCode" type="text" class="form-control" id="deptCode" required="true" placeholder="Enter Department Code">
        </div>
        <div class="form-group">
            <label >Department Name</label>
            <input name="deptName" type="text" class="form-control" required="true" id="eptName" placeholder="Enter Department Name">
        </div>
        <div class="form-group">
            <label >Department Description</label>
            <input name="deptDesc" type="textarea" class="form-control" required="true" id="deptDesc" placeholder="Enter description">
        </div>
       <div class="form-horizontal">
           <label>Status</label>
            <input name="status" type="checkbox" class="form-control" required="true" id="status" placeholder="Workplace">
        </div>
        
        <input type="hidden" name="id"/>
              
        
        <a href="${SITE_URL}/department/index.jsp" class="btn btn-default btn-danger">Back</a>
        <button type="submit" class="btn btn-default btn-success">Save</button>
                

        
    </form>


</div>

</body>
</html>

