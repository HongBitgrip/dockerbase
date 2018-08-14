FROM 5.189.132.250:8083/maven3

RUN curl -fsSL -o /tmp/SenchaCmd-6.5.3.6-linux-amd64.sh https://mirrors.bitgrip.berlin/sencha/SenchaCmd-6.5.3.6-linux-amd64.sh \
  && chmod +x /tmp/SenchaCmd-6.5.3.6-linux-amd64.sh \
  && mkdir /usr/local/sencha \
  && mkdir /usr/local/sencha/cmd \
  && yum install  -y which \
  && /tmp/SenchaCmd-6.5.3.6-linux-amd64.sh -q -dir /usr/local/sencha/cmd \
  && ln -s /usr/local/sencha/cmd/sencha /usr/local/bin/sencha \
  && rm -f /tmp/SenchaCmd-6.5.3.6-linux-amd64.sh \
  && yum install  -y fontconfig freetype freetype-devel fontconfig-devel libstdc++ \
  && curl -fsSL -o  /tmp/phantomjs-2.1.1-linux-x86_64.tar.bz2 https://mirrors.bitgrip.berlin/phantomjs/phantomjs-2.1.1-linux-x86_64.tar.bz2 \
  && mkdir -p /opt/phantomjs \
  && yum install -y bzip2 \
  && tar -xjvf /tmp/phantomjs-2.1.1-linux-x86_64.tar.bz2 -C /opt/phantomjs/ --strip-components=1 \
  && ln -s /opt/phantomjs/bin/phantomjs /usr/local/bin/phantomjs \
  && yum install -y libffi-devel openssl-devel \
#  && pip install pyopenssl pyasn1 \
#  && pip install requests[security] \
  && rm -f /tmp/phantomjs-2.1.1-linux-x86_64.tar.bz2

COPY sencha.cfg /usr/local/sencha/cmd/sencha.cfg
COPY sencha.vmoptions /usr/local/sencha/cmd/sencha.vmoptions