<!DOCTYPE html>
<html lang="ko">
<head>
<title>Tables - SB Admin</title>
<%@ include file="/WEB-INF/views/admin/common/header.jsp"%>
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
					<div class="card-header"></div>
					<div class="card-body">
						<jsp:include page="/WEB-INF/views/admin/stocks/stocks_info.jsp" />
					</div>
				</div>
			</div>
			</main>
			<%@ include file="/WEB-INF/views/admin/common/footer.jsp"%>
		</div>
	</div>
</body>
</html>
