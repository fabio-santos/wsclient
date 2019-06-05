<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Exames - Listagem</title>
<script src="js/jquery-3.3.1.slim.min.js"></script>
<script src="js/popper.min.js"></script>
<link rel="stylesheet" href="css/bootstrap.min.css">
<script src="js/bootstrap.min.js"></script>
<link rel="stylesheet" href="css/fontawesome/all.min.css">	
</head>
<body>
	<div class="container mt-5">
		<div class="row">
			<div class="col">
				<h2 class="text-center">
					Digite o ID do Exame: 
				</h2>
				<s:form action="showExame" method="post">
					<input class="form-control" name="exameId"/>
					<br>
					<button type="submit" class="btn btn-outline-success">Buscar</button>
				</s:form>
			</div>
		</div>
	</div>
</body>
</html>