<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<table class="table table-hover" id="table" width="100%" cellspacing="0">
    <thead class="thead-dark">
        <tr>
        	<th>타입</th>
        	<th>종목명(코드)</th>
        	<th>평단가</th>
        	<th>현재가</th>
        	<th>상태</th>
        	<th>최대보유일</th>
        	<th>매수일</th>
        	<th>매수가</th>
        	<th>매도일</th>
        	<th>매도가</th>
        	<th>비중</th>
        	<th>사유</th>
        </tr>
    </thead>
 	<tbody>
 		<c:forEach var="item" items="${pList}" varStatus="status">
 			<c:set var="history_len" value="${fn:length(item.agPortHistory) }" />
 			<tr>
 				<td rowspan="${history_len+2}">${item.ag_type}</td>
 				<td rowspan="${history_len+2 }">${item.stock_name}(${item.code })</td>
 				<td rowspan="${history_len+2 }">${item.average_buy_price}</td>
 				<td rowspan="${history_len+2 }">현재가</td>
 				<td rowspan="${history_len+2 }">${item.status}</td>
 				<td rowspan="${history_len+2 }">${item.holding_day}</td>
 			</tr>
 				<c:forEach var="his" items="${item.agPortHistory }">
 				<tr>
 					<c:choose>
					<c:when test="${his.type == 'B' }">
		 				<td>${his.date}</td>
		 				<td>${his.price}</td>
		 				<td></td><td></td>
		 				<td>${his.percent}</td>
		 				<td>${his.reason}</td>
	 				</c:when>
	 				<c:when test="${his.type == 'S' }">
		 				<td></td><td></td>
		 				<td>${his.date}</td>
		 				<td>${his.price}</td>
		 				<td>${his.percent}</td>
		 				<td>${his.reason}</td>
		 			</c:when>
		 			</c:choose>
		 		</tr>
 				</c:forEach>
  		</c:forEach>
 	</tbody>
</table>





<table class="table table-hover" id="table" width="100%" cellspacing="0">
    <thead class="thead-dark">
        <tr>
        	<c:forEach var="type" items="${types}" >
            <th>${type}</th>
            </c:forEach>
        </tr>
    </thead>
 	<tbody>
 		<c:forEach var="item" items="${items}" varStatus="status">
 			<tr>
 				<td>${item.date}</td>
 				<td>${item.type}</td>
 				<td>${item.code}</td>
 				<td>${item.name_kor}</td>
 				<td>${item.score}</td>
	 		</tr>
  		</c:forEach>
 	</tbody>
</table>
<ul class="pagination" style="justify-content:center;">
	<li class="page-item"><a class="page-link" href="/admin/allgo/score.allgo?curPage=1">First</a></li>
	<li class="page-item"><a class="page-link" href="/admin/allgo/score.allgo?curPage=${paging.curPage - paging.pageSize }">Previous</a></li>
	
	<c:forEach begin="${paging.startPage }" end="${paging.endPage }" step="1" varStatus="status">
		<c:choose>
		<c:when test="${paging.curPage eq status.index }">
			<li class="page-item active">
		</c:when>
		<c:otherwise>
			<li class="page-item">
		</c:otherwise>
		</c:choose>
			<a class="page-link" href="/admin/allgo/score.allgo?curPage=${status.index }">${status.index }</a>
		</li>
	</c:forEach>
	
	<li class="page-item"><a class="page-link" href="/admin/allgo/score.allgo?curPage=${paging.curPage + paging.pageSize }">Next</a></li>
  	<li class="page-item"><a class="page-link" href="/admin/allgo/score.allgo?curPage=${paging.lastPage }">End</a></li>
</ul>
</html>