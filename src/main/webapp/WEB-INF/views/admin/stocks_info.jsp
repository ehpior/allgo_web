<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
    <thead>
        <tr>
        	<c:forEach var="type" items="${types}" >
            <th>${type}</th>
            </c:forEach>
        </tr>
    </thead>
 	<tbody>
 		<c:forEach var="item" items="${items}" varStatus="status">
 			<tr>
 				<td>${status.index}</td>
 				<td>${item.code}</td>
 				<td>${item.kor_name}</td>
 				<td>${item.market}</td>
 				<td>${item.price}</td>
	 		</tr>
  		</c:forEach>
 	</tbody>
</table>
</html>