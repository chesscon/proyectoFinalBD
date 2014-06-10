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
        Ingrese los siguientes campos para crear una nueva escuela
      </div>
      <div class="panel-body">
        <div class="row">
          <form:form method="POST" commandName="empleado" role="form">
            <div class="form-group">
              <label for="exampleInputEmail2">RFC</label>
              <input type="email" class="form-control" id="exampleInputEmail2" 
                     placeholder="Ingresa RFC" name="rfc">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword2">Nombre</label>
              <input type="password" class="form-control" id="exampleInputPassword2" 
                     placeholder="Nombre" name="nombre">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword2">Apellido Paterno</label>
              <input type="password" class="form-control" id="exampleInputPassword2" 
                     placeholder="Apellido Paterno" name="apaterno">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword2">Apellido Materno</label>
              <input type="password" class="form-control" id="exampleInputPassword2" 
                     placeholder="Apellido Paterno" name="amaterno">
            </div>
            <div class="form-group">
              <label for="exampleInputPassword2">Correo Electrónico</label>
              <input type="password" class="form-control" id="exampleInputPassword2" 
                     placeholder="mail@domain.com" name="correo">
            </div>
            <div class="form-group">
              <label  for="exampleInputPassword2">Teléfono</label>
              <input type="password" class="form-control" id="exampleInputPassword2" 
                     placeholder="000 55 55 55 55" name="telefono">
            </div>

            <div class="form-group">
              <label for="exampleInputPassword2">Cargo</label>
              <input type="password" class="form-control" id="exampleInputPassword2" 
                     placeholder="Ej. Responsable de Seguridad" name="cargo">
            </div>

            <h2>Domicilio de la Escuela:</h2>
            <div class="form-group input-group">
              <span class="input-group-addon">Calle</span>
              <input type="text" class="form-control" placeholder="calle" name="calle">
            </div>

            <div class="form-group input-group">
              <span class="input-group-addon">Número</span>
              <input type="text" class="form-control" placeholder="000" name="numero">
            </div>

            <div class="form-group input-group">
              <span class="input-group-addon">Colonia</span>
              <input type="text" class="form-control" placeholder="colonia" name="colonia">
            </div>

            <div class="form-group input-group">
              <span class="input-group-addon">CP</span>
              <input type="text" class="form-control" placeholder="55555" name="cp">
            </div>

            <div class="form-group input-group">
              <span class="input-group-addon">Ciudad</span>
              <input type="text" class="form-control" placeholder="ciudad" name="ciudad">
            </div>

            <div class="form-group input-group">
              <span class="input-group-addon">Estado</span>
              <input type="text" class="form-control" placeholder="estado" name="estado">
            </div>

            <div class="form-group">
              <label for="exampleInputPassword2">fecha</label>
              <input type="password" class="form-control" id="exampleInputPassword2" 
                     placeholder="dd/mm/aaaa" name="fechaNac">
            </div>

            <div class="form-group">
              <select class="form-control" name="">
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