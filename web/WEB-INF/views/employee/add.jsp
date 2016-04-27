<%@include file="../index.jsp" %>
   <h1>Add Doctor Information!</h1>


<div class="container-fluid">
    <form action="${SITE_URL}/employee/add?sucess" method="post" >
        <div class="form-group">
            <label >Employee name</label>
            <input name="name" type="text" class="form-control" id="empName" required="true" placeholder="Enter Employee Code">
        </div>
        <div class="form-group">
            <label >Employee Email ID </label>
            <input name="email" type="email" class="form-control" required="true" id="email" placeholder="Enter email address">
        </div>
        <div class="form-group">
            <label >Contact </label>
            <input name="contact" type="text" class="form-control" required="true" id="contact" placeholder="Enter contact">
        </div>
        <div class="form-group">
            <label >Department ID </label>
            <input name="dptId" type="number" class="form-control" required="true" id="dptId" placeholder="Enter department id">
        </div>
       <div class="form-horizontal">
           <label>Status</label>
            <input name="status" type="checkbox" class="form-control" id="status" >
        </div>
        
        <input type="hidden" name="id"/>
              
        
        <a href="${SITE_URL}/employee/index.jsp" class="btn btn-default btn-danger">Back</a>
        <button type="submit" class="btn btn-default btn-success">Save</button>
                

        
    </form>


</div>

</body>
</html>

