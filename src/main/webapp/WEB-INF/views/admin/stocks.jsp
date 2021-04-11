<!DOCTYPE html>
<html lang="en">
    <head>
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
    	window.onload = function(){	
    	/*$(document).ready(function() {
			$("#tr_table").load("/admin/stocks_info.allgo",{tr_code:nav_search}); */
			$("#tr_table").load("/admin/stocks_info.allgo");		
		};
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
                            <div class="card-body">
                                DataTables is a third party plugin that is used to generate the demo table below. For more information about DataTables, please visit the
                                <a target="_blank" href="https://datatables.net/">official DataTables documentation</a>
                                .
                            </div>
                        </div>
                        <div class="card mb-4">
                            <div class="card-header">
                                <i class="fas fa-table mr-1"></i>
                                DataTable Example
                            </div>
                            <div class="card-body">
			                    <div class="row">
			                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
			                            <select class="form-control search-slt" id="exampleFormControlSelect1">
			                                <option>Select Vehicle</option>
			                            </select>
			                        </div>
			                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
			                            <input type="text" class="form-control search-slt" placeholder="Enter Pickup City">
			                        </div>
			                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
			                            <input type="text" class="form-control search-slt" placeholder="Enter Drop City">
			                        </div>
			                        <div class="col-lg-3 col-md-3 col-sm-12 p-0">
			                            <button type="button" class="btn btn-danger wrn-btn">Search</button>
			                        </div>
			                    </div>
                                <div class="table-responsive" id="tr_table">
                                </div>
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
