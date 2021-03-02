<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
<script src="/admin/resources/js/scripts.js"></script>

<script src="https://cdn.datatables.net/1.10.20/js/jquery.dataTables.min.js" crossorigin="anonymous"></script>
<script src="https://cdn.datatables.net/1.10.20/js/dataTables.bootstrap4.min.js" crossorigin="anonymous"></script>
<script src="/admin/resources/assets/demo/datatables-demo.js"></script>

<script type="text/javascript">
function numberWithCommas(x) {
    return x.toString().replace(/\B(?=(\d{3})+(?!\d))/g, ",");
}

function jniTest(){
 	var nav_search = $("#nav_search").val();
  	console.log(nav_search);
  	$("#tr_table").load("/admin/table.allgo",{tr_code:nav_search});
  	/* $.ajax({
		async: false,
		type: 'POST',
		data: {"jniTest":nav_search},
		url: "/admin/jniTest2.do",
		success: function(res) {
			alert(res);
		},
		error: function (request, status, error) {
			alert("ErrorCode["+request.status+"]: "+error);
		}
	}); */
}
</script>