<?php

	function validaProdutos($dados){
		$erro = false;
		if($dados['titulo'] == ''){
			$erro .= '<p> Preencha um titulo </p>';
		}
		if($dados['descricao'] == ''){
			$erro .= '<p> Preencha um descricao </p>';
		}
		if($dados['valor'] == ''){
			$erro .= '<p> Preencha um valor </p>';
		}
		return $erro;
	}

?>