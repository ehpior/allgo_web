<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<style>
.sb-sidenav-menu{
	-ms-overflow-style: none; 
} 
.sb-sidenav-menu::-webkit-scrollbar{ 
	display:none; 
}
.sb-sidenav-menu-heading{
	font-size: 1rem !important;
	padding: 1rem 0.9rem 0.5rem 0.9rem !important;
	color: #ffffff !important;
}
.nav-link{
	padding: 0.5rem 2.5rem 0.5rem 2.5rem !important;
	color: rgba(255, 255, 255, 0.5) !important;
}
.nav-link:hover{
	color: #ffffff !important;
}
</style>

<div id="layoutSidenav_nav">
	<nav class="sb-sidenav accordion sb-sidenav-dark" id="sidenavAccordion">
		<div class="sb-sidenav-menu">
			<div class="nav">
				<div class="sb-sidenav-menu-heading">Main</div>
				<a class="nav-link" href="/admin/main.allgo">
					Dashboard
				</a>


				<div class="sb-sidenav-menu-heading">Stocks</div>
				<a class="nav-link" href="/admin/stocks.allgo">
					Stocks
				</a> <a class="nav-link" href="/admin/stocks_cheg.allgo">
					체결데이터
				</a> <a class="nav-link" href="/admin/stocks_program.allgo">
					프로그램데이터
				</a>


				<div class="sb-sidenav-menu-heading">알고리즘</div>
				<a class="nav-link" href="/admin/portfolio.allgo">
					포트폴리오
				</a> <a class="nav-link" href="/admin/allgo_info.allgo">
					분석 정보
				</a> <a class="nav-link" href="/admin/benefit.allgo">
					수익률
				</a> <a class="nav-link" href="/admin/allgo_score.allgo">
					스코어
				</a>


				<div class="sb-sidenav-menu-heading">고객 관리</div>
				<a class="nav-link" href="/admin/order_history.allgo">
					결제 조회
				</a> <a class="nav-link" href="/admin/refund.allgo">
					환불
				</a> <a class="nav-link" href="/admin/user_info.allgo">
					고객 정보
				</a> <a class="nav-link" href="/admin/user_notice.allgo">
					알림 전송
				</a>


				<div class="sb-sidenav-menu-heading">앱 PUSH</div>
				<a class="nav-link" href="/admin/push_history.allgo">
					PUSH 내역
				</a> <a class="nav-link" href="/admin/push.allgo">
					PUSH 전송
				</a> 
				
				
				<div class="sb-sidenav-menu-heading">앱 마케팅</div>
				<a class="nav-link" href="/admin/stocks.allgo">
					배너 관리
				</a> <a class="nav-link" href="/admin/stocks_cheg.allgo">
					공지사항 관리
				</a> 
				
			</div>
		</div>
		<div class="sb-sidenav-footer">
			<div class="small">Logged in as:</div>
			Start Bootstrap
		</div>
	</nav>
</div>