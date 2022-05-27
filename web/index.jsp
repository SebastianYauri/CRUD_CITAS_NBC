
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="Modelo.Persona"%>
<%@page import="Modelo.Persona"%>
<%@page import="ModeloDAO.PersonaDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="./css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="css/bootstrap.min.css">
	    <!----css3---->
        <link rel="stylesheet" href="css/custom.css">
	
	
	<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Roboto:wght@300;400;500;700;900&display=swap" rel="stylesheet">

	
	
	
	<!--google material icon-->
        <link href="https://fonts.googleapis.com/css2?family=Material+Icons"
      rel="stylesheet">
        <title>NEW BODY CENTER</title>
    </head>
    

    
    
    <body>
      
<div class="wrapper">


<div class="body-overlay"></div>


        <!-- Sidebar  -->
        <nav id="sidebar">
            <div class="sidebar-header">
                <h3><img src="img/logo.png" class="img-fluid"/><span>NEW BODY CENTER</span></h3>
            </div>
            <ul class="list-unstyled components">
                <li  class="active">
                    <a href="index.jsp" class="dashboard"><i class="material-icons">dashboard</i><span>HOME</span></a>
                </li>
		
		      <div class="small-screen navbar-display">

                        
                        <li  class="d-lg-none d-md-block d-xl-none d-sm-block">
                            <a href="Controlador1?accion=listarHorarios"><i class="material-icons">apps</i><span>HORARIOS</span></a>
                        </li>
                        
                        <li  class="d-lg-none d-md-block d-xl-none d-sm-block">
                            <a href="Controlador?accion=listar"><i class="material-icons">person</i><span>CLIENTES</span></a>
                        </li>
                        
			</div>

               
            </ul>

           
        </nav>
		
		

        <!-- Page Content  -->
        <div id="content">
		
		<div class="top-navbar">
            <nav class="navbar navbar-expand-lg">
                <div class="container-fluid">

                    <button type="button" id="sidebarCollapse" class="d-xl-block d-lg-block d-md-mone d-none">
                        <span class="material-icons">arrow_back_ios</span>
                    </button>
					
					<a class="navbar-brand" href="#"> Dashboard </a>
					
                    <button class="d-inline-block d-lg-none ml-auto more-button" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="material-icons">more_vert</span>
                    </button>

                    <div class="collapse navbar-collapse d-lg-block d-xl-block d-sm-none d-md-none d-none" id="navbarSupportedContent">
                        <ul class="nav navbar-nav ml-auto">   
                            <li class="dropdown nav-item active">
               
                               </a>
                            </li>
           
                        </ul>
                    </div>
                </div>
            </nav>
	    </div>
			
			
	<div class="main-content">
			
			
					
					
                    <div class="row ">
                        <div class="col-lg-6 col-md-12">
                             <div class="card" style="min-height: 485px" >

                                <img src="img/img7.jpg" class="img-responsive  "/>     
                                
                            </div>
                        </div>
                      
                        <div class="col-lg-6 col-md-12">
                            <div class="card" style="min-height: 485px" >
                  
                                <img src="img/img6.jpg" class="img-responsive"/>     
                                
                            </div>
                        </div>
                
                
                
                    </div>
					
					
						
		<footer class="footer">
                    <div class="container-fluid">
			<div class="row">
			 <div class="col-md-6">
                            <nav class="d-flex">
                                <ul class="m-0 p-0">
                                    <li>
                                        <a href="#">
                                            Home
                                        </a>
                                    </li>

                                </ul>
                            </nav>
                   
                        </div>
				<div class="col-md-6">
				 <p class="copyright d-flex justify-content-end"> &copy 2022 UTP Alumnos Sebastian y Franklin
     
                                </p>
				</div>
			 </div>
                    </div>
                 </footer>
					
	</div>
					
				

        </div>
    </div>






	
  
     <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
   <script src="js/jquery-3.3.1.slim.min.js"></script>
   <script src="js/popper.min.js"></script>
   <script src="js/bootstrap.min.js"></script>
   <script src="js/jquery-3.3.1.min.js"></script>
  
  
  <script type="text/javascript">
  $(document).ready(function () {
            $('#sidebarCollapse').on('click', function () {
                $('#sidebar').toggleClass('active');
				$('#content').toggleClass('active');
            });
			
			 $('.more-button,.body-overlay').on('click', function () {
                $('#sidebar,.body-overlay').toggleClass('show-nav');
            });
			
        });


     
           
       
</script>
  
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  <script src="//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js"></script>
    </body>
</html>
