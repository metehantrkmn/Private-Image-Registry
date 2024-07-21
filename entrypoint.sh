#!/bin/sh

# Wait for the registry service to be up and running
until curl -s http://myregistry:5000 > /dev/null; do
    echo "Waiting for my_registry to be up..."
    sleep 2
done

# Get the IP address of the my_registry container
REGISTRY_IP=$(getent hosts myregistry | awk '{ print $1 }')

# Add the IP address to /etc/hosts
echo "$REGISTRY_IP myregistry" >> /etc/hosts
echo "$REGISTRY_IP myregistry:5000" >> /etc/hosts

# Execute the original command (Java application)
exec "$@"
