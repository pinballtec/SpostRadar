import json
filename = 'data.json'
with open(filename, 'r') as f:
    data = json.load(f)
    events_group = data['Events']
    for i in events_group:
        idev = i['competitors']
        start_date = i['start_date']
        venue = i['venue']
        try:
            location = venue['name']
            for x in idev:
                Team_name = x['name']
                Team_qualifier = x['qualifier']
                away_winner = i['probability_away_team_winner']
                home_winner = i['probability_home_team_winner']
                draw = i['probability_draw']
                if Team_qualifier == 'home':
                    print(f'\n{Team_name} is {Team_qualifier}')
                elif Team_qualifier == 'away':
                    print(f'{Team_name} is {Team_qualifier}')
            if away_winner > home_winner and Team_qualifier == 'away':
                print(f'The away team will win with: {away_winner}, {Team_name},\nstart date {start_date} on {location}')
            else:
                print(f'The home team will win with: {home_winner},\nstart date {start_date} on {location}\n')
        except TypeError:
            for x in idev:
                Team_name = x['name']
                Team_qualifier = x['qualifier']
                away_winner = i['probability_away_team_winner']
                home_winner = i['probability_home_team_winner']
                draw = i['probability_draw']
                if Team_qualifier == 'home':
                    print(f'\n{Team_name} is {Team_qualifier}')
                elif Team_qualifier == 'away':
                    print(f'{Team_name} is {Team_qualifier}')
            if away_winner > home_winner and Team_qualifier == 'away':
                print(f'The away team will win with: {away_winner} {Team_name},\nstart date {start_date}, no info for location')
            else:
                print(f'The home team will win with: {home_winner},\nstart date {start_date}, no info for location\n')


