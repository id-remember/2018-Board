<html>
	<head>
		<meta charset="UTF-8">
    <!-- Bootstrap -->
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="../bootstrap-4.1.3-dist/css/bootstrap.min.css" rel="stylesheet">
	</head>
	<body>
		<div class="container">
		<form role="form" method="post" action="/board/createPOST">
			<div class="form-group">
			<label for="writer">작성자</label>
			<input type="text" name="writer" size="20" value='${login.id}'>
			</div>
			<div class="form-group">
			<label for="title">제목</label>
			<input type="text" name="title" size="20">
			</div>
			<div class="form-group">
			<label for="content">내용</label>
			<input type="text" name="content" size="20">
			</div>
			<div class="form-group">
			<input type="submit">
			</div>
		</form>
		</div>
	</body>
</html>