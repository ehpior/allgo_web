<!DOCTYPE html>
<html lang="ko">
<head>
    <%@ include file="/WEB-INF/views/admin/common/header.jsp" %>
    <title>Page Title - SB Admin</title>
</head>
<body class="bg-primary">
    <div id="layoutAuthentication">
        <div id="layoutAuthentication_content">
            <main>
                <div class="container">
                    <div class="row justify-content-center">
                        <div class="col-lg-5">
                            <div class="card shadow-lg border-0 rounded-lg mt-5">
                                <div class="card-header"><h3 class="text-center font-weight-light my-4">Login</h3></div>
                                <div class="card-body">
                                    <form id="login_form" action="loginResult.do" onsubmit="javascript:login();">
                                        <div class="form-group">
                                            <label class="small mb-1" for="inputEmailAddress">Email</label>
                                            <input class="form-control py-4" id="inputEmailAddress" type="id" placeholder="Enter email address" />
                                        </div>
                                        <div class="form-group">
                                            <label class="small mb-1" for="inputPassword">Password</label>
                                            <input class="form-control py-4" id="inputPassword" type="password" placeholder="Enter password" />
                                        </div>
                                        <div class="form-group">
                                            <div class="custom-control custom-checkbox">
                                                <input class="custom-control-input" id="rememberPasswordCheck" type="checkbox" />
                                                <label class="custom-control-label" for="rememberPasswordCheck">Remember password</label>
                                            </div>
                                        </div>
                                        <div class="form-group d-flex align-items-center justify-content-between mt-4 mb-0">
                                            <a class="small" href="password.login">Forgot Password?</a>
                                            <input type="submit" class="btn btn-primary" value="Login" />
                                        </div>
                                    </form>
                                </div>
                                <div class="card-footer text-center">
                                    <div class="small"><a href="signUp.login">Need an account? Sign up!</a></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>
        <%@ include file="/WEB-INF/views/admin/common/footer.jsp" %>
    </div>
    
    <script type="text/javascript">
function login(){
	var isSuccess = false;
	
	var id = $('#inputEmailAddress').val();
	var password = $('#inputPassword').val();
	
	if( id == "" ) {
		$('#inputEmailAddress').focus();
		return isSuccess;
	} else if( password == "" ) {
		$('#inputPassword').focus();
		return isSuccess;
	} 
	$.ajax({
		async: false,
		type: 'POST',
		data: {"id":id,"password":password},
		url: "/admin/login.do",
		success: function(res) {
			if(res == 1){
				isSuccess = true;
			}
		},
		error: function (request, status, error) {
			alert("ErrorCode["+request.status+"]: "+error);
		}
	});
	
	return isSuccess;
}
</script>
</body>
</html>
