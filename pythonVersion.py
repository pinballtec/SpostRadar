import json
filename = 'data.json'
with open(filename, 'r') as f:
    data = json.load(f)
    events_group = data['Events']
    for i in events_group:
        idev = i['competitors']
        for x in idev:
            Team_name = x['name']
            Team_qualifier = x['qualifier']
            away_winner = i['probability_away_team_winner']
            home_winner = i['probability_home_team_winner']
            draw = i['probability_draw']
            if Team_qualifier == 'home':
                print(f'{Team_name} is {Team_qualifier}')
            elif Team_qualifier == 'away':
                print(f'{Team_name} is {Team_qualifier}')