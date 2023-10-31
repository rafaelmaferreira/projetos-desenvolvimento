modulo.exports = {
  entry:"./src/app3.ts",
  output:{
    filename:"./producao/app3.js"
  },
  resolve: {
    extensions: [".ts", ".tsx", ".js"]
  },
  module : {
    loaders: [
      {test: /\.tsx?$/, loader:"ts-loader" }
    ]
  }
}
