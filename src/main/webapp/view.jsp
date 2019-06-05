<%@taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Exames - View</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">	

</head>
<body>
	<br><br>
	<div class="container">
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
				<label>M�dico: </label> <s:property value="exame.medico"/>
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