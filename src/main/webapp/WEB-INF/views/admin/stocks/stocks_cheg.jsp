<!DOCTYPE html>
<html lang="ko">
<head>
	<%@ include file="/WEB-INF/views/admin/common/header.jsp"%>
	<title>Tables - SB Admin2</title>
</head>
<script type="text/javascript">
	$(document).ready(function() {
		/*$(document).ready(function() {
		$("#tr_table").load("/admin/stocks_info.allgo",{tr_code:nav_search}); */
		//$("#tr_table").load("/admin/stocks_info.allgo", {curPage:"1"});		
	});
</script>
<body class="sb-nav-fixed">
	<%@ include file="/WEB-INF/views/admin/common/top_nav.jsp"%>
	<div id="layoutSidenav">
		<%@ include file="/WEB-INF/views/admin/common/side_nav.jsp"%>
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
						<form class="form-inline" method="get"
							action="/admin/stocks_cheg.allgo">
							종목코드 : <input type="text" id="curPage" class="form-control"
								name="curPage" /> <input type="submit" class="btn btn-primary" />
						</form>
					</div>
					<div class="card-body">
						<jsp:include
							page="/WEB-INF/views/admin/stocks/stocks_cheg_info.jsp" />
					</div>
				</div>
			</div>
			</main>
			<%@ include file="/WEB-INF/views/admin/common/footer.jsp"%>
		</div>
	</div>
</body>
</html>
