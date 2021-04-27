<!DOCTYPE html>
<html lang="en">
    <head>
    	<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Tables - SB Admin</title>
        <%@ include file="common/header.jsp" %>
        <link href="https://cdn.datatables.net/1.10.20/css/dataTables.bootstrap4.min.css" rel="stylesheet" crossorigin="anonymous" />
    </head>
    <script type="text/javascript">
    
    	$(document).ready(function(){	
    	/*$(document).ready(function() {
			$("#tr_table").load("/admin/stocks_info.allgo",{tr_code:nav_search}); */
			//$("#tr_table").load("/admin/stocks_info.allgo", {curPage:"1"});		
		});
	</script>
    <body class="sb-nav-fixed">
        <%@ include file="common/top_nav.jsp" %>
        <div id="layoutSidenav">
            <%@ include file="common/side_nav.jsp" %>
            <div id="layoutSidenav_content">
                <main>
                    <div class="container-fluid">
                        <h1 class="mt-4">Tables</h1>
                        <ol class="breadcrumb mb-4">
                            <li class="breadcrumb-item"><a href="index.jsp">Dashboard</a></li>
                            <li class="breadcrumb-item active">Tables</li>
                        </ol>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table mr-1"></i>
                                <form class="form-inline" method="get" action="/admin/allgos.allgo">
                                	종목코드 : <input type="text" id="curPage" class="form-control" name="curPage" />
                                	<input type="submit" class="btn btn-primary" />
                                </form>
                            </div>
                            <div class="card-body">
                                	<jsp:include page="/WEB-INF/views/admin/allgos_info.jsp" />
                            </div>
                        </div>
                    </div>
                </main>
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2020</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <%@ include file="common/footer.jsp" %>
    </body>
</html>
