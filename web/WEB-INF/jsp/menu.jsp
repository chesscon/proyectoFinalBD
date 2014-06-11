
<nav class="navbar navbar-default navbar-fixed-top" role="navigation" style="margin-bottom: 0">
  <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
      <span class="sr-only">Toggle navigation</span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
      <span class="icon-bar"></span>
    </button>
    <a class="navbar-brand" href="index.html">Administraci&oacute;n</a>
  </div>
  <!-- /.navbar-header -->
  <!-- /.navbar-top-links -->

  <div class="navbar-default navbar-static-side" role="navigation">
    <div class="sidebar-collapse">
      <ul class="nav" id="side-menu">
        <li class="sidebar-search">
          <div class="input-group custom-search-form">
            <input type="text" class="form-control" placeholder="Search...">
            <span class="input-group-btn">
              <button class="btn btn-default" type="button">
                <i class="fa fa-search"></i>
              </button>
            </span>
          </div>
          <!-- /input-group -->
        </li>
        <li>
          <a href="${pageContext.request.contextPath}/index.htm"><i class="fa fa-dashboard fa-fw"></i> Dashboard</a>
        </li>
        <!--<li>
          <a href="tables.html"><i class="fa fa-table fa-fw"></i> Visitas programadas</a>
        </li>-->
        <li>
          <a href="#"><i class="fa fa-wrench fa-fw"></i> Consultar ...<span class="fa arrow"></span></a>
          <ul class="nav nav-second-level">
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/dinosaurio.htm">Dinosaurios</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/habitat.htm">Habitats</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/escuelas.htm">Escuelas</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/visitantes.htm">Visitantes</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/boleto.htm">Boletos</a>
            </li>
          </ul>
          <!-- /.nav-second-level -->
        </li>
        <li>
          <a href="#"><i class="fa fa-sitemap fa-fw"></i> Organizaci&oacute;n<span class="fa arrow"></span></a>
          <ul class="nav nav-second-level">
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/empleado.htm">Empleados</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/vehiculo.htm">Vehiculos</a>
            </li>
          </ul>
          <!-- /.nav-second-level -->
        </li>
        <li>
          <a href="#"><i class="fa fa-wrench fa-fw"></i> Reservaciones ...<span class="fa arrow"></span></a>
          <ul class="nav nav-second-level">
            <li>
              <a href="${pageContext.request.contextPath}/reservacion/crear.htm"><i class="fa fa-edit fa-fw"></i> Registrar Reservacion</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/reservacion/crearEscuela.htm"><i class="fa fa-edit fa-fw"></i> Registrar Escuela</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/reservacion/crearPersona.htm"><i class="fa fa-edit fa-fw"></i> Registrar Persona</a>
            </li>
            <li>
              <a href="${pageContext.request.contextPath}/mostrar/reservacion.htm"><i class="fa fa-files-o fa-fw"></i> consultar</a>
            </li>
          </ul>
        </li>
      </ul>
      <!-- /#side-menu -->
    </div>
    <!-- /.sidebar-collapse -->
  </div>
  <!-- /.navbar-static-side -->
</nav>