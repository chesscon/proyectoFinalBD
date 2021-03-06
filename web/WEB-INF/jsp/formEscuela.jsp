<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div id="page-wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">Formulario para Escuela</h1>
    </div>
    <!-- /.col-lg-12 -->
  </div>
  <!-- /.row -->
  <div class="row">
    <div class="col-lg-12">
      <div class="panel panel-default">
        <div class="panel-heading">
          Ingrese los siguientes campos para crear una nueva escuela
        </div>
        <div class="panel-body">
         <form:form method="POST" commandName="cliente" role="form">
          <div class="row">
            <div class="col-lg-12">
              <form role="form">
                <div class="form-group">
                  <label>Nombre de la Escuela</label>
                  <input class="form-control" placeholder="Nombre Escuela" name="nombre">
                </div>
                
                <h2>Domicilio de la Escuela:</h2>
                <div class="form-group input-group">
                  <span class="input-group-addon">Calle</span>
                  <input type="text" class="form-control" placeholder="calle" name="calle">
                </div>
                
                <div class="form-group input-group">
                  <span class="input-group-addon">N�mero</span>
                  <input type="text" class="form-control" placeholder="000" name ="numero">
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
                
                <div class="form-group input-group">
                  <span class="input-group-addon">Tel�fono 1</span>
                  <input type="text" class="form-control" placeholder="000 55 55 55 55">
                </div>
                
                <div class="form-group input-group">
                  <span class="input-group-addon">Tel�fono 2</span>
                  <input type="text" class="form-control" placeholder="000 55 55 55 55">
                </div>
                
                <button type="submit" class="btn btn-default">Registrar Escuela</button>
                <button type="reset" class="btn btn-default">Limpiar Campos</button>
              </form>
            </div>
            <!-- /.col-lg-12 (nested) -->
          </div>
          <!-- /.row (nested) -->
          </form:form>
        </div>
        <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
    </div>
    <!-- /.col-lg-12 -->
  </div>
  <!-- /.row -->
</div>
<!-- /#page-wrapper -->