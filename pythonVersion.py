import json
filename = 'data.json'
with open(filename, 'r') as f:
    data = json.load(f)
    print(data)