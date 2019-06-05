<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Exames - View</title>
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
					Exame: <s:property value="exame.id"/>
					<a href="index.action" class="btn btn-outline-warning"><i class="fas fa-home"></i></a>
				</h2>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label>Pessoa: </label>	<s:property value="exame.nomePessoa"/>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label>Médico: </label> <s:property value="exame.medico"/>
			</div>
		</div>
		<div class="row">
			<div class="col">
				<label>Tipo Exame: </label> <s:property value="exame.tipoExame"/>
			</div>
		</div>
	</div>
</body>
</html>