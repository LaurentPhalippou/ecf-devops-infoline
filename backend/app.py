from http.server import SimpleHTTPRequestHandler, HTTPServer

PORT = 8080

server = HTTPServer(("", PORT), SimpleHTTPRequestHandler)
print(f"Serveur backend lancé sur le port {PORT}")
server.serve_forever()
