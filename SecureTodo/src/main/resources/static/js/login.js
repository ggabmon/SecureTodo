function login(){
	const id = $('#id').val();
	const pw = $('#pw').val();
	
	$.ajax({
		url:'/loginCheck',
		method:'POST',
		contentType: 'application/json',
		data: JSON.stringify({id:id, pw:pw}),
		success:function(response){
			console.log('Login Success', response);
			alert('로그인 성공');  // 경고 창 표시
            window.location.href = '/todo';  // 사용자를 성공 페이지로 리다이렉션
        },
		error: function(error){
			console.log('Login failed', error);
			alert('로그인 실패');  // 경고 창 표시
            return false;			
		}
	});
}