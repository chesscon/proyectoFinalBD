
<div id="page-wrapper">
  <div class="row">
    <div class="col-lg-12">
      <h1 class="page-header">Dashboard</h1>
    </div>
    <!-- /.col-lg-12 -->
  </div>
  <!-- /.row -->
  <div class="row">
    <div class="col-lg-8">
      <div class="panel panel-default">
        <div class="panel-heading">
          <i class="fa fa-bar-chart-o fa-fw"></i> Visitantes
          <div class="pull-right">
            <div class="btn-group">
              <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                Ver
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu pull-right" role="menu">
                <li><a href="#">&Uacute;ltima semana</a>
                </li>
                <li><a href="#">&Uacute;ltimo mes</a>
                </li>
                <li><a href="#">&Uacute;ltimo a&ntilde;o</a>
                </li>
                <li class="divider"></li>
                <li><a href="#">Archivo hist&oacute;rico</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <!-- /.panel-heading -->
        <div class="panel-body">
          <div id="morris-area-chart"></div>
        </div>
        <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
      <div class="panel panel-default">
        <div class="panel-heading">
          <i class="fa fa-bar-chart-o fa-fw"></i> Visitas realizadas
          <div class="pull-right">
            <div class="btn-group">
              <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
                Ver
                <span class="caret"></span>
              </button>
              <ul class="dropdown-menu pull-right" role="menu">
                <li><a href="#">Reservaciones</a>
                </li>
                <li><a href="#">Visitas confirmadas</a>
                </li>
                <li><a href="#">Visitas realizadas</a>
                </li>
                <li class="divider"></li>
                <li><a href="#">Reporte estad&iacute;stico</a>
                </li>
              </ul>
            </div>
          </div>
        </div>
        <!-- /.panel-heading -->
        <div class="panel-body">
          <div class="row">
            <div class="col-lg-4">
              <div class="table-responsive">
                <table class="table table-bordered table-hover table-striped">
                  <thead>
                    <tr>
                      <th>#</th>
                      <th>Fecha</th>
                      <th>Hora</th>
                      <th>Monto</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>3326</td>
                      <td>10/21/2013</td>
                      <td>3:29 PM</td>
                      <td>$321.33</td>
                    </tr>
                    <tr>
                      <td>3325</td>
                      <td>10/21/2013</td>
                      <td>3:20 PM</td>
                      <td>$234.34</td>
                    </tr>
                    <tr>
                      <td>3324</td>
                      <td>10/21/2013</td>
                      <td>3:03 PM</td>
                      <td>$724.17</td>
                    </tr>
                    <tr>
                      <td>3323</td>
                      <td>10/21/2013</td>
                      <td>3:00 PM</td>
                      <td>$23.71</td>
                    </tr>
                    <tr>
                      <td>3322</td>
                      <td>10/21/2013</td>
                      <td>2:49 PM</td>
                      <td>$8345.23</td>
                    </tr>
                    <tr>
                      <td>3321</td>
                      <td>10/21/2013</td>
                      <td>2:23 PM</td>
                      <td>$245.12</td>
                    </tr>
                    <tr>
                      <td>3320</td>
                      <td>10/21/2013</td>
                      <td>2:15 PM</td>
                      <td>$5663.54</td>
                    </tr>
                    <tr>
                      <td>3319</td>
                      <td>10/21/2013</td>
                      <td>2:13 PM</td>
                      <td>$943.45</td>
                    </tr>
                  </tbody>
                </table>
              </div>
              <!-- /.table-responsive -->
            </div>
            <!-- /.col-lg-4 (nested) -->
            <div class="col-lg-8">
              <div id="morris-bar-chart"></div>
            </div>
            <!-- /.col-lg-8 (nested) -->
          </div>
          <!-- /.row -->
        </div>
        <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
      <div class="panel panel-default">
        <div class="panel-heading">
          <i class="fa fa-clock-o fa-fw"></i> Eventos programados
        </div>
        <!-- /.panel-heading -->
        <div class="panel-body">
          <ul class="timeline">
            <li>
              <div class="timeline-badge"><i class="fa fa-check"></i>
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="timeline-title">Reuni&oacute;n semanal</h4>
                  <p>
                    <small class="text-muted"><i class="fa fa-time"></i> hace 11 horas via Twitter</small>
                  </p>
                </div>
                <div class="timeline-body">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                </div>
              </div>
            </li>
            <li class="timeline-inverted">
              <div class="timeline-badge warning"><i class="fa fa-credit-card"></i>
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="timeline-title">Propuesta econ&oacute;mica</h4>
                </div>
                <div class="timeline-body">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                </div>
              </div>
            </li>
            <li>
              <div class="timeline-badge danger"><i class="fa fa-credit-card"></i>
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="timeline-title">Balance financiero</h4>
                </div>
                <div class="timeline-body">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                </div>
              </div>
            </li>
            <li class="timeline-inverted">
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="timeline-title">Facturas pendientes</h4>
                </div>
                <div class="timeline-body">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                </div>
              </div>
            </li>
            <li>
              <div class="timeline-badge info"><i class="fa fa-save"></i>
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="timeline-title">Respaldos programados</h4>
                </div>
                <div class="timeline-body">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                  <hr>
                  <div class="btn-group">
                    <button type="button" class="btn btn-primary btn-sm dropdown-toggle" data-toggle="dropdown">
                      <i class="fa fa-cog"></i> 
                      <span class="caret"></span>
                    </button>
                    <ul class="dropdown-menu" role="menu">
                      <li><a href="#">Lanzar respaldo ahora</a>
                      </li>
                      <li><a href="#">Programar respaldo</a>
                      </li>
                      <li><a href="#">Cancelar respaldo programado</a>
                      </li>
                      <li class="divider"></li>
                      <li><a href="#">Configuraci&oacute;n de respaldos</a>
                      </li>
                    </ul>
                  </div>
                </div>
              </div>
            </li>
            <li>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="timeline-title">Informe de Eventos</h4>
                </div>
                <div class="timeline-body">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                </div>
              </div>
            </li>
            <li class="timeline-inverted">
              <div class="timeline-badge success"><i class="fa fa-thumbs-up"></i>
              </div>
              <div class="timeline-panel">
                <div class="timeline-heading">
                  <h4 class="timeline-title">Social Media</h4>
                </div>
                <div class="timeline-body">
                  <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin vel justo eu mi scelerisque vulputate. Aliquam in metus eu lectus aliquet egestas.</p>
                </div>
              </div>
            </li>
          </ul>
        </div>
        <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
    </div>
    <!-- /.col-lg-8 -->
    <div class="col-lg-4">
      <div class="panel panel-default">
        <div class="panel-heading">
          <i class="fa fa-bell fa-fw"></i> Notificaciones
        </div>
        <!-- /.panel-heading -->
        <div class="panel-body">
          <div class="list-group">
            <a href="#" class="list-group-item">
              <i class="fa fa-comment fa-fw"></i> Nuevo Comentario
              <span class="pull-right text-muted small"><em>Hace 4 minutos</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-twitter fa-fw"></i> 3 Nuevos Seguidores
              <span class="pull-right text-muted small"><em>Hace 12 minutos</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-envelope fa-fw"></i> Mensaje Enviado
              <span class="pull-right text-muted small"><em>Hace 27 minutos</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-tasks fa-fw"></i> Nueva Tarea
              <span class="pull-right text-muted small"><em>Hace 43 minutos</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-upload fa-fw"></i> Reinicio del Servidor
              <span class="pull-right text-muted small"><em>11:32 AM</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-bolt fa-fw"></i> Servidor Detenido!
              <span class="pull-right text-muted small"><em>11:13 AM</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-warning fa-fw"></i> El Servidor No Responde
              <span class="pull-right text-muted small"><em>10:57 AM</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-shopping-cart fa-fw"></i> Nueva reservaci&oacute;n
              <span class="pull-right text-muted small"><em>9:49 AM</em>
              </span>
            </a>
            <a href="#" class="list-group-item">
              <i class="fa fa-money fa-fw"></i> Pago realizado
              <span class="pull-right text-muted small"><em>Ayer</em>
              </span>
            </a>
          </div>
          <!-- /.list-group -->
          <a href="#" class="btn btn-default btn-block">Mostrar todos los avisos</a>
        </div>
        <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
      <div class="panel panel-default">
        <div class="panel-heading">
          <i class="fa fa-bar-chart-o fa-fw"></i> Distribuci&oacute;n de personal
        </div>
        <div class="panel-body">
          <div id="morris-donut-chart"></div>
          <a href="#" class="btn btn-default btn-block">Ver Detalles</a>
        </div>
        <!-- /.panel-body -->
      </div>
      <!-- /.panel -->
      <div class="chat-panel panel panel-default">
        <div class="panel-heading">
          <i class="fa fa-comments fa-fw"></i>
          Chat
          <div class="btn-group pull-right">
            <button type="button" class="btn btn-default btn-xs dropdown-toggle" data-toggle="dropdown">
              <i class="fa fa-chevron-down"></i>
            </button>
            <ul class="dropdown-menu slidedown">
              <li>
                <a href="#">
                  <i class="fa fa-refresh fa-fw"></i> Recargar
                </a>
              </li>
              <li>
                <a href="#">
                  <i class="fa fa-check-circle fa-fw"></i> Disponible
                </a>
              </li>
              <li>
                <a href="#">
                  <i class="fa fa-times fa-fw"></i> Ocupado
                </a>
              </li>
              <li>
                <a href="#">
                  <i class="fa fa-clock-o fa-fw"></i> Ausente
                </a>
              </li>
              <li class="divider"></li>
              <li>
                <a href="#">
                  <i class="fa fa-sign-out fa-fw"></i> Cerrar sesi&oacute;n
                </a>
              </li>
            </ul>
          </div>
        </div>
        <!-- /.panel-heading -->
        <div class="panel-body">
          <ul class="chat">
            <li class="left clearfix">
              <span class="chat-img pull-left">
                <img src="http://placehold.it/50/55C1E7/fff" alt="User Avatar" class="img-circle" />
              </span>
              <div class="chat-body clearfix">
                <div class="header">
                  <strong class="primary-font">Jack Sparrow</strong> 
                  <small class="pull-right text-muted">
                    <i class="fa fa-clock-o fa-fw"></i> Hace 12 mins
                  </small>
                </div>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                </p>
              </div>
            </li>
            <li class="right clearfix">
              <span class="chat-img pull-right">
                <img src="http://placehold.it/50/FA6F57/fff" alt="User Avatar" class="img-circle" />
              </span>
              <div class="chat-body clearfix">
                <div class="header">
                  <small class=" text-muted">
                    <i class="fa fa-clock-o fa-fw"></i> Hace 13 mins</small>
                  <strong class="pull-right primary-font">Bhaumik Patel</strong>
                </div>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                </p>
              </div>
            </li>
            <li class="left clearfix">
              <span class="chat-img pull-left">
                <img src="http://placehold.it/50/55C1E7/fff" alt="User Avatar" class="img-circle" />
              </span>
              <div class="chat-body clearfix">
                <div class="header">
                  <strong class="primary-font">Jack Sparrow</strong> 
                  <small class="pull-right text-muted">
                    <i class="fa fa-clock-o fa-fw"></i> Hace 14 mins</small>
                </div>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                </p>
              </div>
            </li>
            <li class="right clearfix">
              <span class="chat-img pull-right">
                <img src="http://placehold.it/50/FA6F57/fff" alt="User Avatar" class="img-circle" />
              </span>
              <div class="chat-body clearfix">
                <div class="header">
                  <small class=" text-muted">
                    <i class="fa fa-clock-o fa-fw"></i> Hace 15 mins</small>
                  <strong class="pull-right primary-font">Bhaumik Patel</strong>
                </div>
                <p>
                  Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur bibendum ornare dolor, quis ullamcorper ligula sodales.
                </p>
              </div>
            </li>
          </ul>
        </div>
        <!-- /.panel-body -->
        <div class="panel-footer">
          <div class="input-group">
            <input id="btn-input" type="text" class="form-control input-sm" placeholder="Type your message here..." />
            <span class="input-group-btn">
              <button class="btn btn-warning btn-sm" id="btn-chat">
                Enviar
              </button>
            </span>
          </div>
        </div>
        <!-- /.panel-footer -->
      </div>
      <!-- /.panel .chat-panel -->
    </div>
    <!-- /.col-lg-4 -->
  </div>
  <!-- /.row -->
</div>
<!-- /#page-wrapper -->