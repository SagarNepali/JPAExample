
<%@include file="header.jsp" %>
<c:set var="SITE_URL" value="${pageContext.request.contextPath}"/>
<body>
    <nav class="navbar navbar-default">
        <div class="container-fluid">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">LFA System</a>
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">


                    <li class="dropdown">
                        <a href="${SITE_URL}/department/index.jsp" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false"> Department <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="${SITE_URL}/department/index.jsp">View</a></li>
                            <li><a href="${SITE_URL}/department/add.jsp">Add</a></li>
                            <li><a href="${SITE_URL}/department/edit.jsp">Edit</a></li>
                            <li><a href="${SITE_URL}/department/delete.jsp">Delete</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                    <li class="dropdown">
                        <a href="${SITE_URL}/employee/index.jsp" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Employee <span class="caret"></span></a>
                        <ul class="dropdown-menu">
                            <li><a href="#">View</a></li>
                            <li><a href="#">Edit</a></li>
                            <li><a href="#">Delete</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">Separated link</a></li>
                            <li role="separator" class="divider"></li>
                            <li><a href="#">One more separated link</a></li>
                        </ul>
                    </li>
                </ul>
                <!--                <form class="navbar-form navbar-left" role="search">
                                    <div class="form-group">
                                        <input type="text" class="form-control" placeholder="Search">
                                    </div>
                                    <button type="submit" class="btn btn-default">Submit</button>
                                </form>-->

                <ul class="nav navbar-nav navbar-right">
                    <li><a href="${SITE_URL}/login.jsp">Login</a></li>
                </ul>
            </div><!-- /.navbar-collapse 
        </div><!-- /.container-fluid -->
    </nav>

                
                
                
                
                
                