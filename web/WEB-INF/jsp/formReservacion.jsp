<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

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
          Ingrese los siguientes campos para realizar una reservación
      </div>
      <div class="panel-body">
        <form:form method="POST" commandName="reservacion" role="form">
          <div class="form-group">
            <label  for="exampleInputEmail2">Tipo</label>
            <form:select path="tipo">
                <form:options items="${tipoList}" itemValue="id" itemLabel="tipoVisita"/>
              </form:select>
          </div>  
          
          <div class="form-group">
            <label  for="exampleInputEmail2">Fecha</label>
            <input type="date" name="fecha" class="form-control">
          </div>
          
          <div class="form-group">
            <label  for="exampleInputEmail2">Zonas a visitar</label>
            <form:checkboxes items="${listaZonas}" path="zonas" />
          </div>
          
        </form:form>
      </div>
        
    </div>
    
  </div>              
</div>