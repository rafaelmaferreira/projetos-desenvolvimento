<?php

function getConexao(){
	$conexao = new \PDO("mysql:host=127.0.0.1:3307;dbname=curso_php_basico","root","ferreira1*");

	return $conexao;
}