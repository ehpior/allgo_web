<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

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
 				<td>${item.score}</td>
	 		</tr>
  		</c:forEach>
 	</tbody>
</table>
<ul class="pagination" style="justify-content:center;">
	<li class="page-item"><a class="page-link" href="/admin/allgos.allgo?curPage=1">First</a></li>
	<li class="page-item"><a class="page-link" href="/admin/allgos.allgo?curPage=${paging.curPage - paging.pageSize }">Previous</a></li>
	
	<c:forEach begin="${paging.startPage }" end="${paging.endPage }" step="1" varStatus="status">
		<c:choose>
		<c:when test="${paging.curPage eq status.index }">
			<li class="page-item active">
		</c:when>
		<c:otherwise>
			<li class="page-item">
		</c:otherwise>
		</c:choose>
			<a class="page-link" href="/admin/allgos.allgo?curPage=${status.index }">${status.index }</a>
		</li>
	</c:forEach>
	
	<li class="page-item"><a class="page-link" href="/admin/allgos.allgo?curPage=${paging.curPage + paging.pageSize }">Next</a></li>
  	<li class="page-item"><a class="page-link" href="/admin/allgos.allgo?curPage=${paging.lastPage }">End</a></li>
</ul>
</html>