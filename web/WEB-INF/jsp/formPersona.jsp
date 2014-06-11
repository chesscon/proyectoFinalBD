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
              <label  for="curp">CURP</label>
              <input type="text" class="form-control" id="curp" name="CURP" placeholder="CURP">
            </div>
            <div class="form-group">
              <label for="nombre">Nombre</label>
              <input type="text" class="form-control" id="nombre" name="nombre" placeholder="Nombre">
            </div>
            <div class="form-group">
              <label  for="apaterno">Apellido Paterno</label>
              <input type="text" class="form-control" id="apaterno" name="apaterno" placeholder="Apellido Paterno">
            </div>
            <div class="form-group">
              <label for="amaterno">Apellido Materno</label>
              <input type="text" class="form-control" id="amaterno" name="amaterno" placeholder="Apellido Materno">
            </div>
            <div class="form-group">
              <label for="amaterno">Grado Escolar:</label>
              <input type="text" class="form-control" name="grado" id="grado" placeholder="Ej. 1º de Primaria">
            </div>

            <div class="form-group">
              <label  for="fecha">Fecha de Nacimiento</label>
              <input type="date" name="fechaNac" class="form-control" 
                     placeholder="dd/mm/aaaa" id="fecha"/>
            </div>

            <div class="form-group">
              <select class="form-control" id="tipo" name="tipo">
                <option>Selecciona Tipo</option>
                <option value="ALUMNO">Alumno</option>
                <option value="PROFESOR">Profesor</option>
                <option value="DIRECTOR">Director</option>
                <option value="OTRO">Otro</option>
              </select>
            </div>

            <div class="form-group">
              <label  for="escuela">Seleccionar Escuela</label><br />
              <form:select path="idEscuela" >
                <form:options items="${escuelas}" itemValue="codigo" itemLabel="nombre"/>
              </form:select>
            </div>

            <button type="submit" class="btn btn-default">Registrar Persona</button>
          </form:form>
        </div><!-- /.row -->
      </div>
    </div>
  </div>
</div>