<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="page-wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">Formulario para registrar una Persona</h1>
    </div>
    <!-- /.col-lg-12 -->
  </div>

<div class="col-lg-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          Ingrese los siguientes campos para registrar una persona
        </div>
        <div class="panel-body">
<div class="row">
  <form:form method="POST" commandName="persona" role="form">
    <div class="form-group">
      <label  for="exampleInputEmail2">CURP</label>
      <input type="email" class="form-control" id="exampleInputEmail2" placeholder="CURP">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword2">Nombre</label>
      <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Nombre">
    </div>
    <div class="form-group">
      <label  for="exampleInputPassword2">Apellido Paterno</label>
      <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Apellido Paterno">
    </div>
    <div class="form-group">
      <label for="exampleInputPassword2">Apellido Materno</label>
      <input type="password" class="form-control" id="exampleInputPassword2" placeholder="Apellido Materno">
    </div>

    <div class="form-group">
      <label  for="exampleInputPassword2">fecha</label>
      <input type="password" class="form-control" id="exampleInputPassword2" placeholder="dd/mm/aaaa">
    </div>

    <div class="form-group">
      <select class="form-control">
        <option>Selecciona Tipo</option>
        <option>Alumno</option>
        <option>Profesor</option>
        <option>Director</option>
      </select>
    </div>

    <button type="submit" class="btn btn-default">Registrar Persona</button>
  </form:form>
</div><!-- /.row -->
</div>
        </div></div></div>