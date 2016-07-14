# ejemplo-jdbc-oracle
<b>Uso de JDBC primitivo Oracle, ejemplo de Connection y Select</b>

// Se carga el driver JDBC

			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());

			// nombre del servidor
			String nombre_servidor = "127.0.0.1";
			// numero del puerto
			String numero_puerto = "1521";
			// SID
			String sid = "xe";
			// URL "jdbc:oracle:thin:@nombreServidor:numeroPuerto:SID"
			String url = "jdbc:oracle:thin:@" + nombre_servidor + ":" + numero_puerto + ":" + sid;

			// Nombre usuario y password
			String usuario = "SYSTEM";
			String password = "xxxx";

			// Obtiene la conexion
			Connection conexion = DriverManager.getConnection(url, usuario, password);

			// Para realiza una consulta
			Statement sentencia = conexion.createStatement();
			ResultSet resultado = sentencia.executeQuery("SELECT * FROM TEST_DB1.CLIENTE");
		
			// Se recorre el resultado obtenido
			while (resultado.next()) {
				// Se imprime el resultado colocando
				// Para obtener la primer columna se coloca el numero 1 y para
				// la segunda columna 2 el numero 2
				//System.out.println(resultado.getInt("ID_CLIENTE") + "\t" + resultado.getString(2));
				clientes.add(new Cliente(resultado));
			}

			// Cerramos la sentencia
			sentencia.close();
			conexion.close();
