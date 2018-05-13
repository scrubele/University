# coding=utf-8
"""
Порахувати кількість успішних GET запитів презентацій (мстять слово presentations в урлі запиту)
виконаних 17/May/2015 в проміжку між 01:00 до 21:00
Лог файл: https://raw.githubusercontent.com/elastic/examples/master/ElasticStack_apache/apache_logs
"""

import requests
import re

if __name__ == "__main__":
    """ url = 'https://raw.githubusercontent.com/elastic/examples/master/Common%20Data%20Formats/apache_logs/apache_logs'
    f = requests.get(url, allow_redirects=True)
    open('apache_logs', 'wb').write(f.content)"""

    f = open('apache_logs', 'r')
    count = 0
    for line in f:
        if re.search('(\\d*[.]*){4}[ -]*[[]17.May.2015:(\\d{2}:*){3} [+]\\d*[]][ ]*"GET .presentations.*" 200.*',
                     str(line)):
            data = re.search('([:]\d{2}){3}', str(line))
            if data:
                time = int(re.sub(':', '', data.group(0)))
                if (time > 10000)&(time < 210000):
                  #  print time
                  #  print line
                    count += 1x
     #   print line
    print(count)
    f.close()
