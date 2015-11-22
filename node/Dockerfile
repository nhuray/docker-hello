#
# Hello World based on Node.js
#

FROM 1science/node:consul

# Install node dependencies
RUN npm install config && \
    npm install swig  && \
    npm install nodemon -g

# Install app
ADD app /app
WORKDIR /app

# Use nodemon to reload node when configuration is changed
CMD ["nodemon", "hello.js"]