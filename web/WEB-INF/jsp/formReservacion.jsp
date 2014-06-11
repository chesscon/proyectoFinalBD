<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<div id="page-wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">Formulario para registrar una reservación</h1>
    </div>
    <!-- /.col-lg-12 -->
  </div>

  <div class="col-lg-12">
    <div class="panel panel-default">
      <div class="panel-heading">
          Ingrese los siguientes campos para realizar una reservación
      </div>
      <div class="panel-body">
        <form:form method="POST" commandName="reservacion" role="form">
          <div class="form-group">
            <label  for="exampleInputEmail2">Tipo</label>
            <form:select path="tipovisita">
                <form:options items="${tipoList}" itemValue="id" itemLabel="descripcion"/>
              </form:select>
          </div>  
          
          <div class="form-group">
            <label  for="exampleInputEmail2">Fecha</label>
            <form:input path="fecha" class="form-control" />
            <!--<input type="date" name="fecha" class="form-control">-->
          </div>
          
          <div class="form-group">
            <label  for="exampleInputEmail2">Zonas a visitar</label><br />
            <form:checkboxes items="${listaZonas}" path="zonas" itemValue="id" itemLabel="descripcion" delimiter="<br />" />
          </div>
          
          <div class="form-group">
            <label  for="escuela">Seleccionar Escuela</label><br />
            <form:select path="escuela" >
                <form:options items="${ListEscuela}" itemValue="codigo" itemLabel="nombre"/>
              </form:select>
          </div>
          
        </form:form>
      </div>
        
    </div>
    
  </div>              
</div>