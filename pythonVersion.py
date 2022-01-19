import json
filename = 'data.json'
with open(filename, 'r') as f:
    data = json.load(f)
    events_group = data['Events']
    for i in events_group:
        idev = i['competitors']
        print(idev)