#!/bin/bash

# Script para conectar el repositorio local con GitHub
# Usage: ./connect_github.sh <tu-usuario-github>

if [ -z "$1" ]; then
    echo "Error: Debes proporcionar tu usuario de GitHub"
    echo "Usage: ./connect_github.sh <tu-usuario-github>"
    echo "Ejemplo: ./connect_github.sh MiguelGende"
    exit 1
fi

GITHUB_USER=$1
REPO_NAME="DAM_ED04_Actividad"

echo " Conectando repositorio local con GitHub..."
echo " Usuario: $GITHUB_USER"
echo " Repositorio: $REPO_NAME"
echo ""

# Add remote origin
echo "➕ Añadiendo remote origin..."
git remote add origin "https://github.com/$GITHUB_USER/$REPO_NAME.git"

# Rename branch to main
echo " Renombrando rama a main..."
git branch -M main

echo ""
echo " Configuración completada!"
echo ""
echo " Siguiente paso: Hacer push al repositorio remoto"
echo "   Ejecuta: git push -u origin main"
echo ""
echo " Verificar remoto configurado:"
git remote -v
