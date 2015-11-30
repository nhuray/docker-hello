#
# Hello World based on Node.js
#

FROM 1science/node:4.2.2-consul

# Install node dependencies
RUN npm install config && \
    npm install swig  && \
    npm install nodemon -g

# Install app
ADD src /app
WORKDIR /app

# Install consul templates
ADD etc /etc

EXPOSE 8000

# Use nodemon to reload node when configuration is changed
CMD ["nodemon", "-w", "/app/config", "hello.js"]