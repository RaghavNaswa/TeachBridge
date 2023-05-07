from flask import Flask, jsonify, request
from flask_cors import CORS, cross_origin
from initial_response_generator import get_initial_response
from keyword_extractor import extract_keywords

app = Flask(__name__)
CORS(app, support_credentials=True)

@app.route('/get_initial_response', methods=['POST'])
@cross_origin(supports_credentials=True)
def get_response():
    data = request.json

    response = jsonify({'message': get_initial_response(data['name'])})
    response.headers.add('Content-Type', 'application/json')
    return jsonify({'message': get_initial_response(data['name'])})

@app.route('/get_keywords', methods=['POST'])
def get_keywords():
    data = request.json
    return jsonify({'message': extract_keywords(data['name'])})

if __name__ == '__main__':
    app.run()
