/* importar o modulo do framework express */
var express = require('express');

/* importar o modulo do framework consign */
var express = require('consign');

/* importar o modulo do framework body-parser */
var express = require('body-parser');

/* importar o modulo do framework express validator */
var express = require('express-validator');

*/ iniciar o objeto do express */
var app = express();

/* setar as váriasveis 'view engine' e 'view' do express*/
app.set('view engine', 'ejs');
app.set('views', './app/views');

/* configurar o middleware express.static*/

app.use(express.static('./app/public'));

/* configurar o middleware body-parser*/

app.use(bodyParser.urlencoded({extended:true}));

/* configurar o middleware express validator*/

app.use(expressValidator());
/* efetua o uploado das rotas dos models e dos controlers para o objeto app*/
consign()
    .include('app/routes')
    .then('app/models')
    .then('app/controllers')
    .into('app');
/* exportar o objeto app*/
module.exports = app;


